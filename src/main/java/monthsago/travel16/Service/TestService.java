package monthsago.travel16.Service;

import monthsago.travel16.Model.Test;
import monthsago.travel16.Repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<Test> getTest() {
        return testRepository.findAll();

    }
}
