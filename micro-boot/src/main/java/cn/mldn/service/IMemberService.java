package cn.mldn.service;

import java.util.Map; 
import java.util.Set;

import cn.mldn.vo.Member;

public interface IMemberService {
	public Member get(String mid) ;
	public Map<String,Set<String>> getRoleAndActionByMember(String mid) ;
}
