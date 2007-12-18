package com.yalestar.controller.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yalestar.util.ForwardConstants;
import com.yalestar.data.OtherDAO;
import com.yalestar.data.EntriesDAO;

import java.util.ArrayList;

public class ShowArchives extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception {

        EntriesDAO dao = new EntriesDAO();
        ArrayList archives = dao.getArchives();
        request.setAttribute("archives", archives);
        return mapping.findForward(ForwardConstants.SUCCESS);

    }
}
