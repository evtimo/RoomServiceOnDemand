package university.project.roomserviceondemand.services;

import org.springframework.stereotype.Service;
import university.project.roomserviceondemand.models.Feedback;
import university.project.roomserviceondemand.models.Request;
import university.project.roomserviceondemand.repository.FeedbackRepository;
import university.project.roomserviceondemand.repository.RequestRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FeedbackService {
    private final FeedbackRepository feedbackRepository;

    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @Transactional
    public void save(Feedback feedback) { feedbackRepository.save(feedback); }

}
