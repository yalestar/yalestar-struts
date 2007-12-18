package com.yalestar.controller.action;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yalestar.util.ForwardConstants;

public class ShowCommentsAction extends DispatchAction {

    public ActionForward show(ActionMapping mapping, ActionForm form,
                              HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String cid = mapping.getParameter();
        return mapping.findForward(ForwardConstants.SHOW_COMMENT);

    }


    public ActionForward add(ActionMapping mapping, ActionForm form,
                             HttpServletRequest request, HttpServletResponse response) {

        return mapping.findForward(ForwardConstants.ADDED_COMMENT);

    }
}
