package cn.fmm.java_learn.design_pattern.state_pattern.project;



/**
 * @author kdd
 * @time 2022/11/14
 * @desc 导学场景状态机实现
 */
public class ConcreteStateMachine extends StateMachine {

    private static final String CLASSNAME = ConcreteStateMachine.class.getSimpleName();

    private static ConcreteStateMachine sInstance;

    public static void initialize(Builder builder) {
        sInstance = builder.build();
    }

    public static ConcreteStateMachine getInstance() {

        return sInstance;
    }


    // PRIVATE METHODS

//    private List<IEventVerifier> eventVerifiers;
    private AudioTalkInitialState initialState;
    private AudioTalkPrepareState prepareState;
    private AudioTalkEnterState enterState;
    private AudioTalkRunningState runningState;

    private ConcreteStateMachine(Builder builder) {
        super();
//        this.eventVerifiers = builder.eventVerifiers;

        initStates();
        addStates();
        setInitialState(initialState);
    }





    // PRIVATE METHODS

    private void initStates() {
        initialState = new AudioTalkInitialState();
        prepareState = new AudioTalkPrepareState();
        enterState = new AudioTalkEnterState();
        runningState = new AudioTalkRunningState();
    }

    private void addStates() {
        // 连麦初始状态（未连麦）
        addState(EventType.EXIT_EVENT, EventType.EXIT_SUB_EVENT_LEAVE, initialState);
        addState(EventType.EXIT_EVENT, EventType.EXIT_SUB_EVENT_EXCEPTION, initialState);
        addState(EventType.EXIT_EVENT, EventType.EXIT_SUB_EVENT_TEACHER_OFFLINE, initialState);
        addState(EventType.EXIT_EVENT, EventType.EXIT_SUB_EVENT_TEACHER_LEAVE, initialState);
        addState(EventType.EXIT_EVENT, EventType.EXIT_SUB_EVENT_CONNECTION_LOST, initialState);

        // 准备连麦状态（导学提醒）
        addState(EventType.PREPARE_EVENT, prepareState);

        // 发起连麦状态
        addState(EventType.ENTER_EVENT, enterState);

        // 连麦中状态
        addState(EventType.INSTRUCT_EVENT, EventType.INSTRUCT_SUB_EVENT_ON_MICROPHONE, runningState);
        addState(EventType.INSTRUCT_EVENT, EventType.INSTRUCT_SUB_EVENT_OFF_MICROPHONE, runningState);
        addState(EventType.INSTRUCT_EVENT, EventType.INSTRUCT_SUB_EVENT_OPEN_WHITEBOARD, runningState);
        addState(EventType.INSTRUCT_EVENT, EventType.INSTRUCT_SUB_EVENT_CLOSE_WHITEBOARD, runningState);
    }


    // OVERRIDE METHODS

    @Override
    public boolean post(Event event) {
//        for (IEventVerifier v : eventVerifiers) {
//            int result = v.isValid(currentState, event);
//
//            if (result == IEventVerifier.VERIFY_CONTINUE) {
//                // continue
//            } else if (result == IEventVerifier.VERIFY_SUCCEED) {
//                break;
//            } else if (result == IEventVerifier.VERIFY_FAILURE) {
//                SLogUtil.error("%s::%s::%s 事件校验失败，currentState : %s, verifier class is %s, event = %s",
//                        Module.NAME, CLASSNAME, "post", currentState.getStateId(), v.getClass().getSimpleName(), event.toString());
//                return false;
//            }
//        }

        return super.post(event);
    }


    // PUBLIC CLASSES

    public static class Builder {

//        private List<IEventVerifier> eventVerifiers = new ArrayList<>();

        public Builder() {

        }

//        public Builder addEventVerifier(IEventVerifier verifier) {
//            this.eventVerifiers.add(verifier);
//            return this;
//        }

        private ConcreteStateMachine build() {
            return new ConcreteStateMachine(this);
        }
    }

}
