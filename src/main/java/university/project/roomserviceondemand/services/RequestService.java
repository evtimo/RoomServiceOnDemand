package university.project.roomserviceondemand.services;

import org.springframework.stereotype.Service;
import university.project.roomserviceondemand.models.Request;
import university.project.roomserviceondemand.repository.RequestRepository;

import java.util.List;

@Service
public class RequestService {
    private final RequestRepository requestRepository;

    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public List<Request> findAll() {
        return requestRepository.findAll();
    }

    public List<Request> getAllByUserId(Long userId) {
        List<Request> allByUserId = requestRepository.getAllByUserId(userId);
        allByUserId.sort((t1,t2) -> t2.getDate().compareTo(t1.getDate()));
        return allByUserId;
    }

    public void save(Request request) {
        requestRepository.save(request);
    }
}
