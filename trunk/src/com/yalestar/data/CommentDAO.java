package com.yalestar.data;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.yalestar.model.Comment;
import com.yalestar.model.Entry;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.ArrayList;

public class CommentDAO extends BaseDAO {

    private static Logger logger = Logger.getRootLogger();

    private SqlMapClient smc = SQLMapsConfigurator.getSQLMapper();


    public Integer addComment(Comment comment) {
        try {

            return (Integer) smc.insert("insertComment", comment);
        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("bad insert of comment");
        }
        return null;
    }


    public ArrayList<Comment> getCommentsForPost(Entry entry) {
        ArrayList comments = null;

        try {
            comments = (ArrayList) smc.queryForList("getCommentsForPost", entry.getID());

        } catch (SQLException e) {
            System.out.println("getCommentsForPost error");

        }
        return comments;

    }

}
