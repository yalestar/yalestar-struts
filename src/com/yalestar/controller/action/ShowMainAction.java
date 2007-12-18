package com.yalestar.controller.action;

import com.yalestar.data.EntriesDAO;
import com.yalestar.data.LinksDAO;
import com.yalestar.util.Configurator;
import com.yalestar.util.ForwardConstants;
import org.apache.log4j.Logger;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class ShowMainAction extends DispatchAction {

    private static Logger logger = Logger.getRootLogger();


    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception {

        EntriesDAO dao = new EntriesDAO();

        // get the latest 5 (or whatever) viewable entries
        ArrayList entries = dao.getEntries(
                Integer.parseInt(Configurator.getProperty("mainPage.entries")));

        LinksDAO linksDAO = new LinksDAO();
        ArrayList links = linksDAO.getAllLinks();
        request.setAttribute("links", links.iterator());
        request.setAttribute("mainEntries", entries.iterator());


        if (entries != null && entries.size() != 0) {
            return mapping.findForward(ForwardConstants.SUCCESS);
        }
        return mapping.findForward(ForwardConstants.ERROR);
    }
}
