package notice.controller;

import javax.servlet.http.*;
import notice.model.NoticeDAO;
import notice.model.Notice;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;

public  class SaveAction extends Action{

  public ActionForward execute(ActionMapping mapping,
                               ActionForm form,
                               HttpServletRequest request,
                               HttpServletResponse response) {

		try{
			NoticeDAO dao=NoticeDAO.getInstance();

			String writer=request.getParameter("writer").trim();
  			String title=request.getParameter("title").trim();
  			String cont=request.getParameter("content").trim();

  			dao.noticeInsert(writer,title,cont);
			
			request.setAttribute("msg","정상적으로 저장 되었습니다.");

			return mapping.findForward("success");
		
        }catch(Exception e){
			return mapping.findForward("error");
		}
	}
}     	
     
/*
  		String id=req.getParameter("writer").trim();
  		String title=req.getParameter("title").trim();
  		String cont=req.getParameter("content").trim();
  		dao.noticeInsert(id,title,cont);
		req.setAttribute("msg","정상적으로 저장 되었습니다.");
		req.getRequestDispatcher("Result.jsp").forward(req,res);
*/
              
