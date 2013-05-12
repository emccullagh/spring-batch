package batching;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Created with IntelliJ IDEA.
 * User: eugene
 * Date: 03/05/2013
 * Time: 14:43
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldTasklet implements Tasklet {

    private static final String HELLO_WORLD = "Hello, world!";

    /**
     * {@inheritDoc}
     */
    @Override
    public RepeatStatus execute( StepContribution arg0, ChunkContext arg1 ) throws Exception {
        System.out.println( HELLO_WORLD );
        return RepeatStatus.FINISHED;
    }
}
