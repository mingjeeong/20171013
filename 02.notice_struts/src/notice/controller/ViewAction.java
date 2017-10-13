package notice.controller;

import javax.servlet.http.*;
import notice.model.NoticeDAO;
import notice.model.Notice;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;

public  class ViewAction extends Action {

  public ActionForward execute(ActionMapping mapping,
                               ActionForm form,
                               HttpServletRequest request,
                               HttpServletResponse response) {

		try{
			NoticeDAO dao=NoticeDAO.getInstance();

  			String num=request.getParameter("num");
  			Notice n = dao.noticeView(Integer.parseInt(num));
			request.setAttribute("nb",n);
			return mapping.findForward("success");	 // ActionForward
			//nextPage="notice/NoticeView.jsp";
		}catch(Exception e){
			return mapping.findForward("error");
			//nextPage="error.jsp";
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
     
              
