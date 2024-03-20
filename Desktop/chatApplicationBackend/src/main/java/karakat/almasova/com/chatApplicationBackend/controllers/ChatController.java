package karakat.almasova.com.chatApplicationBackend.controllers;

import karakat.almasova.com.chatApplicationBackend.models.Message;
import lombok.NoArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;

@Controller
@NoArgsConstructor
public class ChatController {
    private KafkaTemplate<String, Message> kafkaTemplate;

}
