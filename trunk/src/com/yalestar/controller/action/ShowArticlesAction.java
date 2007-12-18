package com.yalestar.controller.action;

import com.yalestar.data.OtherDAO;
import com.yalestar.util.ForwardConstants;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowArticlesAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception {

        OtherDAO dao = new OtherDAO();
        return mapping.findForward(ForwardConstants.SUCCESS);

    }
}
