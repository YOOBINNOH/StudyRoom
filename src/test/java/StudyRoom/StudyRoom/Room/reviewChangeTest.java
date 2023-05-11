package StudyRoom.StudyRoom.Room;

import StudyRoom.StudyRoom.entity.room;
import StudyRoom.StudyRoom.repository.roomRepository;
import StudyRoom.StudyRoom.service.admin.changeReview;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
@Rollback
@Transactional
public class reviewChangeTest {

    @Autowired roomRepository roomRepository;

    @Test
    void 리뷰_변경_성공() {

        // given
        roomDto roomDto = new roomDto(roomRepository);
        String roomName = "test123";
        roomDto.create_room(roomName,10L,15000L,"리뷰 변경 전");

        // when
        changeReview changeReview = new changeReview(roomRepository);

        String newReview = "리뷰 변경 후";
        changeReview.changeReview(roomName,newReview);

        List test = roomRepository.findByroomName(roomName);

        room room = (StudyRoom.StudyRoom.entity.room) test.get(0);

        // then

        Assertions.assertThat(test.isEmpty()==false);
        Assertions.assertThat(room.getRoomInformation()).isEqualTo("리뷰 변경 후");


    }


}
