package com.yalestar.controller.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yalestar.data.EntriesDAO;

import java.util.ArrayList;

public class FetchArchiveAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception {

        String year = request.getParameter("year");
        ArrayList archives = null;
        EntriesDAO dao= new EntriesDAO();
        if (null != year) {
            archives = dao.getArchivesByYear(year);
            request.setAttribute("archivesYear", archives);
            return mapping.findForward("success");
        }
        return null;
    }
}
