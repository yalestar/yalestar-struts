package com.yalestar.controller.action;

import com.yalestar.controller.form.EditEntryForm;
import com.yalestar.data.EntriesDAO;
import com.yalestar.model.Entry;
import com.yalestar.util.ForwardConstants;
import com.yalestar.util.KeyConstants;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditEntryAction extends DispatchAction {

    public ActionForward edit(ActionMapping mapping, ActionForm form,
                              HttpServletRequest request,
                              HttpServletResponse response) throws Exception {


        EntriesDAO entriesDAO = new EntriesDAO();
        EditEntryForm eef = (EditEntryForm) form;
        String postID = request.getParameter("cid");
        Entry entry = entriesDAO.getEntryByID(postID);
        BeanUtils.copyProperties(eef, entry);
        request.getSession().setAttribute(KeyConstants.CONTENT_ID_KEY, postID);
        request.setAttribute("entryToEdit", entry);
        return mapping.findForward(ForwardConstants.EDIT_ENTRY_FORM);
    }


    public ActionForward save(ActionMapping mapping, ActionForm form,
                              HttpServletRequest request,
                              HttpServletResponse response) throws Exception {

        EntriesDAO entriesDAO = new EntriesDAO();
        EditEntryForm eef = (EditEntryForm) form;
        String postID = (String) request.getSession()
                        .getAttribute(KeyConstants.CONTENT_ID_KEY);
        Entry entry = entriesDAO.getEntryByID(postID);
        BeanUtils.copyProperties(eef, entry);
        entriesDAO.editEntry(entry);

        return mapping.findForward(ForwardConstants.SUCCESS);
    }


    public ActionForward delete(ActionMapping mapping, ActionForm form,
                                HttpServletRequest request,
                                HttpServletResponse response) throws Exception {

        EntriesDAO entriesDAO = new EntriesDAO();
        String postID = (String) request.getParameter(KeyConstants.CONTENT_ID_KEY);

        entriesDAO.deleteEntry(Integer.valueOf(postID));
        return mapping.findForward(ForwardConstants.DELETED_ENTRY);
    }


    public ActionForward add(ActionMapping mapping, ActionForm form,
                             HttpServletRequest request,
                             HttpServletResponse response) throws Exception {

        EntriesDAO entriesDAO = new EntriesDAO();

        return mapping.findForward(ForwardConstants.SUCCESS);
    }
}
