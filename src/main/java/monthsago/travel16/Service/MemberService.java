package monthsago.travel16.Service;

import monthsago.travel16.Model.User;
import monthsago.travel16.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public User createUser(User user) {
        return memberRepository.save(user);
    }
}