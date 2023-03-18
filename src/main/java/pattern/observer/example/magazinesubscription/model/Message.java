package pattern.observer.example.magazinesubscription.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class Message {
    private LocalDateTime date;
    private String content;
    private String author;


}
