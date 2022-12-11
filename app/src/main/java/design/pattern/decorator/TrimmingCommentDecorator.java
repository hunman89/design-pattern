package design.pattern.decorator;

public class TrimmingCommentDecorator extends CommentDecoretor {

    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}
