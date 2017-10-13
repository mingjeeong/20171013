package notice.controller;

import javax.servlet.http.*;
import notice.model.NoticeDAO;
import notice.model.Notice;
import java.util.ArrayList;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;

public  class ListAction extends Action{

  public ActionForward execute(ActionMapping mapping,
                               ActionForm form,
                               HttpServletRequest request,
                               HttpServletResponse response) {

		try{
			NoticeDAO dao=NoticeDAO.getInstance();

			ArrayList list=dao.noticeList();
			request.setAttribute("array",list);

            return mapping.findForward("success");

		}catch(Exception e){
			return mapping.findForward("error");
		}
	}
}     	
     
     
              
