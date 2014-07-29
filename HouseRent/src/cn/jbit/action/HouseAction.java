package cn.jbit.action;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jbit.biz.HouseBiz;
import cn.jbit.biz.impl.HouseBizImpl;
import cn.jbit.entity.District;
import cn.jbit.entity.House;
import cn.jbit.entity.Street;
import cn.jbit.entity.Types;
import cn.jbit.entity.Users;
import cn.jbit.mystruts.framework.Action;

public class HouseAction implements Action {

	/* (non-Javadoc)
	 * @see cn.jbit.mystruts.framework.Action#execute(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		try {
			response.setContentType("text/html;charSet=UTF-8");
			request.setCharacterEncoding("UTF-8");
			HouseBiz hBiz=new HouseBizImpl();
			House house = new House();
			house.setContact(request.getParameter("contact"));
			house.setDescription(request.getParameter("description"));
			house.setFloorage(Integer.valueOf(request.getParameter("floorage")));
			house.setPrice(Integer.valueOf(request.getParameter("price")));
			house.setPubdate(new SimpleDateFormat("yyyy-MM-dd").parse(request
					.getParameter("houseDate")));
			house.setTitle(request.getParameter("title"));
			int type_id = Integer.valueOf(request.getParameter("type_id"));
			int district_id = Integer.valueOf(request
					.getParameter("district_id"));
			int street_id = Integer.valueOf(request.getParameter("street_id"));
			Street street = new Street();
			street.setId(street_id);
			Types type = new Types();
			type.setId(type_id);
			District district = new District();
			district.setId(district_id);
			Users user = new Users();
			user.setId(new Integer(1002));
			house.setStreet(street);
			house.setTypes(type);
			house.setUsers(user);
			hBiz.addHouse(house);//添加房屋方法
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "fail";
		}
	}

}
