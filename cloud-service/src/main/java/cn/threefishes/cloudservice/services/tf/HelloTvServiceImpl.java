package cn.threefishes.cloudservice.services.tf;

import cn.threefishes.cloudrepository.dao.MemberMapper;
import cn.threefishes.cloudrepository.entity.Member;
import cn.threefishes.cloudrepository.entity.MemberExample;
import cn.threefishes.cloudrepository.entity.common.ResultEntity;
import cn.threefishes.cloudservice.annotation.DataBase;
import cn.threefishes.cloudservice.serviceinterface.HelloTvService;
import cn.threefishes.cloudservice.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.threefishes.cloudservice.services.dto.*;
import cn.threefishes.cloudcommon.util.ValueObConvert;

@Service("helloTvService")
public class HelloTvServiceImpl  extends BaseServiceImpl<Member,MemberExample> implements HelloTvService {

    @Autowired
    MemberMapper memberMapper;

    @Override
    @DataBase("master")
    public ResultEntity helloTv(){
        Member member  = memberMapper.selectByPrimaryKey(1);
        if(member != null)return new ResultEntity(200,"hello TF" + member.getMemberId(),"From master db");
        else return new ResultEntity(500,"member not found");
    }

    @Override
    public ResultEntity saveMember(MemberDTO memberDTO){
        Member member = new Member(); 
        try{
            ValueObConvert.convert(member,memberDTO);
        }catch(Exception exception){

        }
        int n = memberMapper.insert(member);
        return new ResultEntity(200, "插入成功");
    }
}
