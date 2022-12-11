package design.pattern.decorator;

public class CommentDecoretor implements CommentService {

    private CommentService commentService;

    public CommentDecoretor(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        // TODO Auto-generated method stub
        commentService.addComment(comment);
    }

}
