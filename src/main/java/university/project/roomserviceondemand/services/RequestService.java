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

    public List<Request> getAllByUserId(Long userId) {
        return requestRepository.getAllByUserId(userId);
    }

    public Request getByRequestId(Long requestId) { return  requestRepository.findById(requestId).orElse(new Request()); }

    public void save(Request request) { requestRepository.save(request); }

}
