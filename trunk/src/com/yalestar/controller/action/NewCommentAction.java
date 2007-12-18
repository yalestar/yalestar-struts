package com.yalestar.controller.action;

import com.yalestar.controller.form.NewCommentForm;
import com.yalestar.data.CommentDAO;
import com.yalestar.model.Comment;
import com.yalestar.util.ForwardConstants;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class NewCommentAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response)
            throws Exception {

        NewCommentForm ncf = (NewCommentForm) form;

        Comment comment = new Comment(ncf.getName(), ncf.getComment(),
                request.getParameter("ID"), ncf.getEmail());
        BeanUtils.copyProperties(comment, ncf);
        CommentDAO cd = new CommentDAO();
        comment.setCommentDate(new Date());
        if (cd.addComment(comment) != null) {
            return mapping.findForward(ForwardConstants.ADDED_COMMENT);
        }

        return mapping.findForward(ForwardConstants.ERROR);
    }


}
