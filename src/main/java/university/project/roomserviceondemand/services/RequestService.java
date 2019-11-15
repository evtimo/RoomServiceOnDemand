package university.project.roomserviceondemand.services;

import org.springframework.stereotype.Service;
import university.project.roomserviceondemand.models.Request;
import university.project.roomserviceondemand.repository.RequestRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RequestService {
    private final RequestRepository requestRepository;

    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public List<Request> findAll() {
        List<Request> requestList =  requestRepository.findAll();
        requestList.sort((t1,t2) -> t2.getDate().compareTo(t1.getDate()));
        return requestList;
    }

    public List<Request> getAllByUserId(Long userId) {
        List<Request> allByUserId = requestRepository.getAllByUserId(userId);
        allByUserId.sort((t1,t2) -> t2.getDate().compareTo(t1.getDate()));
        return allByUserId;
    }

    public Request getByRequestId(Long requestId) { return  requestRepository.findById(requestId).orElse(new Request()); }

    @Transactional
    public void save(Request request) { requestRepository.save(request); }

    public void deleteAllReqs() {
        requestRepository.deleteAll();
    }

}
