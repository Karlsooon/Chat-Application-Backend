package karakat.almasova.com.chatApplicationBackend.repositories;

import karakat.almasova.com.chatApplicationBackend.models.ChatMessage;
import karakat.almasova.com.chatApplicationBackend.models.MessageStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatMessageRepository
        extends MongoRepository<ChatMessage, String> {

    long countBySenderIdAndRecipientIdAndStatus(
            String senderId, String recipientId, MessageStatus status);

    List<ChatMessage> findByChatId(String chatId);
}
