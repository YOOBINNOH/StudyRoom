package StudyRoom.StudyRoom.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class room extends BaseTimeEntity{

    @Id @GeneratedValue
    Long roomId;

    // 스터디 룸 이름
    @Column(name = "roomName")
    String roomName;

    // 수용 가능 인원
    Long roomPerson;

    // 스터디 룸 가격
    Long roomPrice;

    // 스터티 룸 설명
    @Lob @Setter
    String roomInformation;

    public room(String roomName, Long roomPerson, Long roomPrice, String roomInformation) {
        this.roomName = roomName;
        this.roomPerson = roomPerson;
        this.roomPrice = roomPrice;
        this.roomInformation = roomInformation;
    }
    public room() {

    }
}
