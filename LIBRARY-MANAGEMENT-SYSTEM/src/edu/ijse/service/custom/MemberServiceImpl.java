package edu.ijse.service.custom;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.MemberDao;
import java.util.ArrayList;

import edu.ijse.dto.MemberDto;
import edu.ijse.entity.MemberEntity;

public class MemberServiceImpl implements MemberService{
    
    private MemberDao memberDao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER);


    @Override
    public String save(MemberDto memberDto) throws Exception {
        MemberEntity entity = getMemberEntity(memberDto);
        return memberDao.save(entity);

    }

    @Override
    public String update(MemberDto memberDto) throws Exception {
        MemberEntity entity = getMemberEntity(memberDto);
        return memberDao.update(entity);

    }

    @Override
    public String delete(String memberId) throws Exception {
        return memberDao.delete(memberId);

    }

    @Override
    public MemberDto get(String memberID) throws Exception {
        MemberEntity entity = memberDao.get(memberID);
        return getMemberDto(entity);

    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
        ArrayList<MemberDto> memberDtos = new ArrayList<>();
        ArrayList<MemberEntity> memberEntities = memberDao.getAll();
        for (MemberEntity memberEntity : memberEntities) {
            MemberDto dto = getMemberDto(memberEntity);
            memberDtos.add(dto);
        }
        return memberDtos;

    }

    private MemberDto getMemberDto(MemberEntity entity){

        MemberDto memberDto = new MemberDto(entity.getMemberID(),
            entity.getMemberFirstName(), entity.getMemberLastName(), entity.getEmail(), 
            entity.getPhoneNumber(), entity.getAddress());

        return memberDto;
    }

    private MemberEntity getMemberEntity(MemberDto dto){

        MemberEntity memberEntity = new MemberEntity(dto.getMemberID(),
            dto.getMemberFirstName(), dto.getMemberLastName(), dto.getEmail(), 
            dto.getPhoneNumber(), dto.getAddress());

        return memberEntity;
    }
    
}
