package mango.mango.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import mango.common.service.impl.ComAbstractDAO;
import mango.mango.model.MemberVO;
import mango.mango.model.NoticeVO;

@Repository("MemberDAO")
public class MemberDAO extends ComAbstractDAO {

	// 기본 설정 - dao
	public String getId(String id) throws Exception {
		return selectOne("MemberMapper.getId", id);
	}

	public int register(MemberVO mVO) throws Exception {
		return insert("MemberMapper.register", mVO);
	}
	public int sellerRegister(MemberVO mVO) throws Exception {
		return insert("MemberMapper.sellerRegister", mVO);
	}

	public MemberVO login(MemberVO mVO) throws Exception {
		return selectOne("MemberMapper.login", mVO);
	}

	public void updateMember(MemberVO mVO) throws Exception {
		update("MemberMapper.updateMember", mVO);
	}

	public void deleteMember(String id) throws Exception {
		delete("MemberMapper.deleteMember", id);
	}
	
	public List<MemberVO> getMember(MemberVO mVO) throws Exception {
		return selectList("MemberMapper.getMember", mVO);
	   }
	   
	public List<MemberVO> getSeller(MemberVO mVO) throws Exception {
		return selectList("MemberMapper.getSeller", mVO);
	}
	
	public Integer getMemberCount(MemberVO mVO) throws Exception {
		return selectOne("MemberMapper.getMemberCount", mVO);
	}
	
	public Integer getSellerCount(MemberVO mVO) throws Exception {
		return selectOne("MemberMapper.getSellerCount", mVO);
	}
	
}