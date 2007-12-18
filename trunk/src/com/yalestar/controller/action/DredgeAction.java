package com.yalestar.controller.action;

import com.yalestar.data.OtherDAO;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class DredgeAction extends DispatchAction {

    /**
     * Get bandnames
     */
    public ActionForward gbn(ActionMapping mapping, ActionForm form,
                             HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        OtherDAO dao = new OtherDAO();
        ArrayList bandnames = dao.getBandnames();
        request.setAttribute("allBandnames", bandnames.iterator());
        System.out.println("asfd");
        return mapping.findForward("showBandnames");
    }


    /**
     * Get articles
     */
    public ActionForward ga(ActionMapping mapping, ActionForm form,
                            HttpServletRequest request, HttpServletResponse response)
            throws Exception {


        OtherDAO dao = new OtherDAO();
        ArrayList bandnames = dao.getBandnames();
        request.setAttribute("allArticles", bandnames.iterator());
        return mapping.findForward("showArticles");

    }


    /**
     * Get bio things
     */
    public ActionForward bio(ActionMapping mapping, ActionForm form,
                             HttpServletRequest request, HttpServletResponse response)
            throws Exception {


        OtherDAO dao = new OtherDAO();
        ArrayList bandnames = dao.getBandnames();
        request.setAttribute("allBios", bandnames.iterator());
        return mapping.findForward("showBios");

    }

}
