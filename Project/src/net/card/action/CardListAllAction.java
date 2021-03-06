package net.card.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.card.db.CardDAOImpl;

 public class CardListAllAction implements Action {
	 public ActionForward execute(HttpServletRequest request,HttpServletResponse response) throws Exception{

		CardDAOImpl carddao=new CardDAOImpl();
		List cardlist=new ArrayList();	
		
		String card_ad = request.getParameter("card_ad");
		
		Map m = new HashMap();
		m.put("card_ad", card_ad);

		cardlist = carddao.getCardList_all(m);
		
		request.setAttribute("cardlist", cardlist);
		
		ActionForward forward= new ActionForward();
	 	forward.setRedirect(false);
 		forward.setPath("./cardlist/cardlistall.jsp");
 		return forward;
	 }
 }