package com.yalestar.controller.action;

import com.yalestar.model.Subdivision;
import com.yalestar.util.ForwardConstants;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubdivisionAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception {

        Subdivision sub = Subdivision.getNew();
        request.setAttribute("subdivision", sub);
        return mapping.findForward(ForwardConstants.SUCCESS);
    }
}
