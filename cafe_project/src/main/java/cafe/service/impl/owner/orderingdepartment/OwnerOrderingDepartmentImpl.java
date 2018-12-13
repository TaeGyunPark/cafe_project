package cafe.service.impl.owner.orderingdepartment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cafe.dao.face.owner.orderingdepartment.OwnerOrderingDepartmentDao;
import cafe.dto.Cafe_ordering_department;
import cafe.service.face.owner.orderingdepartment.OwnerOrderingDepartmentService;

@Service
public class OwnerOrderingDepartmentImpl implements OwnerOrderingDepartmentService {

	@Autowired private OwnerOrderingDepartmentDao ooDeptDao;
	
	@Override
	public List<Cafe_ordering_department> getOrderingDepartmentList(Cafe_ordering_department coDept) {
		return ooDeptDao.selectOrderingDepartmentList(coDept);
	}

	@Override
	public Cafe_ordering_department getOneOrderingDepartment(Cafe_ordering_department coDept) {
		return ooDeptDao.selectOneOrderingDepartment(coDept);
	}

	
	
}