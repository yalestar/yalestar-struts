package com.yalestar.controller.action;

import com.yalestar.data.EntriesDAO;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;

public class ManageEntriesAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception {

        EntriesDAO entriesDAO = new EntriesDAO();
        Collection entries = entriesDAO.getEntries(9999);

        request.setAttribute("entries", entries.iterator());
        return mapping.findForward("success");
    }


}
