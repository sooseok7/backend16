package monthsago.travel16.Service;

import monthsago.travel16.Model.Comments;
import monthsago.travel16.Repository.CommentsRepository;
import monthsago.travel16.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentsService {
    @Autowired
    private CommentsRepository commentsRepository;


    public Optional<Comments> getComments(Integer num) {
        return commentsRepository.findById(num);
    }

    public Comments createComments(Comments comments) {
        return commentsRepository.save(comments);
    }

    public void deleteComments(Integer no) {
        Comments comments = commentsRepository.findById(no).orElseThrow(() -> new ResourceNotFoundException("Not exist Qna Data by no : [" + no + "]"));
        commentsRepository.delete(comments);
    }


    public List<Comments> findCommentsByQnaNo(Integer num){
        return commentsRepository.findCommentsByQnaNo(num);
    }


}