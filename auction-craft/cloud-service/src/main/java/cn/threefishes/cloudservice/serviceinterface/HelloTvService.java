package cn.threefishes.cloudservice.serviceinterface;

import cn.threefishes.cloudrepository.entity.common.ResultEntity;
import cn.threefishes.cloudservice.services.dto.MemberDTO;

public interface HelloTvService {
    ResultEntity helloTv();

    ResultEntity saveMember(MemberDTO member);


}
