/**
 * Simple class containing constants used throughout project
 */
package frc.robot;

public class Constants {
	public static final boolean enable = true;
	public static final double threshholdTime = 0;
	/* Current threshold to trigger current limit */
	public static final int kPeakCurrentAmps = 3;

	/* Duration after current exceed Peak Current to trigger current limit */
	public static final int kPeakTimeMs = 0;

	/* Current to mantain once current limit has been triggered */
	public static final int kContinCurrentAmps = 2;

	/**
	 * Number of joystick buttons to poll. 10 means buttons[1,9] are polled, which
	 * is actually 9 buttons.
	 */
	public final static int kNumButtonsPlusOne = 10;
	public static final int kPIDLoopIdx = 0; // Check how it is done with talon
	/**
	 * How many sensor units per rotation. Using Talon FX Integrated Encoder.
	 * 
	 * @link https://github.com/CrossTheRoadElec/Phoenix-Documentation#what-are-the-units-of-my-sensor
	 */
	public final static int kSensorUnitsPerRotation = 2048;

	/**
	 * Number of rotations to drive when performing Distance Closed Loop
	 */
	public final static double kRotationsToTravel = 6;

	/**
	 * This is a property of the Pigeon IMU, and should not be changed.
	 */
	public final static int kPigeonUnitsPerRotation = 8192;

	/**
	 * Set to zero to skip waiting for confirmation. Set to nonzero to wait and
	 * report to DS if action fails.
	 */
	public final static int kTimeoutMs = 30;

	/**
	 * Motor neutral dead-band, set to the minimum 0.1%.
	 */
	public final static double kNeutralDeadband = 0.001;

	/**
	 * PID Gains may have to be adjusted based on the responsiveness of control loop.
     * kF: 1023 represents output value to Talon at 100%, 6800 represents Velocity units at 100% output
     * Not all set of Gains are used in this project and may be removed as desired.
     * 
	 * 	                                    			  kP   kI   kD   kF               Iz    PeakOut */
	public final static Gains kGains_Distanc = new Gains( 0.1, 0.0,  0.0, 0.0,            100,  0.50 );
	public final static Gains kGains_Turning = new Gains( 2.0, 0.0,  4.0, 0.0,            200,  1.00 );
	public final static Gains kGains_Velocit = new Gains( 0.1, 0.0, 20.0, 1023.0/6800.0,  300,  0.50 );
	public final static Gains kGains_MotProf = new Gains( 1.0, 0.0,  0.0, 1023.0/6800.0,  400,  1.00 );
	
	/*Gains(kp, ki, kd, kf, izone, peak output);
	*/
   public static final Gains kGains_hookMotor = new Gains(0.2, 0.001, 0.0, 0.2, 0, 1.0);

	/** ---- Flat constants, you should not need to change these ---- */
	/*
	 * We allow either a 0 or 1 when selecting an ordinal for remote devices [You
	 * can have up to 2 devices assigned remotely to a talon/victor]
	 */
	public final static int REMOTE_0 = 0;
	public final static int REMOTE_1 = 1;
	/*
	 * We allow either a 0 or 1 when selecting a PID Index, where 0 is primary and 1
	 * is auxiliary
	 */
	public final static int PID_PRIMARY = 0;
	public final static int PID_TURN = 1;
	/*
	 * Firmware currently supports slots [0, 3] and can be used for either PID Set
	 */
	public final static int SLOT_0 = 0;
	public final static int SLOT_1 = 1;
	public final static int SLOT_2 = 2;
	public final static int SLOT_3 = 3;
	/* ---- Named slots, used to clarify code ---- */
	public final static int kSlot_Distanc = SLOT_0;
	public final static int kSlot_Turning = SLOT_1;
	public final static int kSlot_Velocit = SLOT_2;
	public final static int kSlot_MotProf = SLOT_3;
	// smartdashboard editible values
	public final static String kAmpLimitStr = "Amp Limit";
	public final static String kAmpPeakStr = "Amp Peak";

	// Pixy constants
	public final static boolean pixyOnDashboard = true;
	public final static boolean pixyDebug = true;
	public final static boolean pixyLogTimes = true;


	//Hook Height constants
	public final static double hookEncoderUnits = 10000;
	
}
