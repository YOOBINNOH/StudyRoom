package StudyRoom.StudyRoom.service;

import StudyRoom.StudyRoom.Room.LoginDTO;
import StudyRoom.StudyRoom.Room.SignUpDTO;
import StudyRoom.StudyRoom.entity.Member;
import org.springframework.http.ResponseEntity;

public interface MemberService {
    ResponseEntity signUp(SignUpDTO memberDTO);

    ResponseEntity login(LoginDTO loginDTO);

    Member getMemberByEmail(String email);
}
