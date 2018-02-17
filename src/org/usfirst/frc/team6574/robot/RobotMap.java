/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6574.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	/**
	 * The IP address of the radio on the robot's network
	 */
	public static final String RADIO_IP = "10.65.74.1";
	/**
	 * The IP address of the RoboRio on the robot's network
	 */
	public static final String RIO_IP = "10.65.74.2";
	/**
	 * The IP address of the Raspberry Pi on the robot's network
	 */
	public static final String PI_IP = "10.65.74.5";
	
	/**
	 * The CAN ID value assigned to the Power Distribution Panel.
	 */
	public static final int PDP_CAN_ID = -1;
	/**
	 * The CAN ID value assigned to the RoboRio.
	 */
	public static final int RIO_CAN_ID = -1;
	/**
	 * The CAN ID value assigned to the Pneumatics Control Module.
	 */
	public static final int PCM_CAN_ID = -1;
	
	/**
	 * The robot's gyroscope ID .
	 */
	public static final int GYRO_ID = 0;
	
	/**
	 * Map values associated with the robot's input devices.
	 */
	public static class input {
		/**
		 * The USB ID value assigned to the left or primary joystick.
		 */
		public static final int LEFT_JOYSTICK_USB_NUM = 0;
		/**
		 * The USB ID value assigned to the right or secondary joystick.
		 */
		public static final int RIGHT_JOYSTICK_USB_NUM = 1;
		
		/**
		 * The USB ID value assigned to the game controller.
		 */
		public static final int CONTROLLER_USB_NUM = 2;
	}
	
	/**
	 * Map values associated with the robot's shooter mechanism.
	 */
	public static class shooter {
		/**
		 * The PWM output number associated with the shooter's left Spark motor controller.
		 */
		public static final int LEFT_PWM_NUM = 0;
		/**
		 * The PWM output number associated with the shooter's right Spark motor controller.
		 */
		public static final int RIGHT_PWM_NUM = 1;
	}
	
	/**
	 * Map values associated with the robot's drive train.
	 */
	public static class driveTrain {
		/**
		 * The CAN ID assigned to the front left Talon SRX motor controller.
		 */
		public static final int FRONT_LEFT_CAN_ID = 2;
		/**
		 * The CAN ID assigned to the front right Talon SRX motor controller.
		 */
		public static final int FRONT_RIGHT_CAN_ID = 1;
		/**
		 * The CAN ID assigned to the back left Talon SRX motor controller.
		 */
		public static final int BACK_LEFT_CAN_ID = 3;
		/**
		 * The CAN ID assigned to the back right Talon SRX motor controller.
		 */
		public static final int BACK_RIGHT_CAN_ID = 0;
		
		/**
		 * The PCN port for the solenoid to disengage the drive shifting mechanism.
		 */
		public static final int SHIFT_OFF_PCN_ID = 0;
		/**
		 * The PCN port for the solenoid to engage the drive shifting mechanism.
		 */
		public static final int SHIFT_ON_PCN_ID = 1;
	}
	
	/**
	 * Map values associated with the robot's intake.
	 */
	public static class intake {
		/**
		 * The PWM output number associated with the intake's left Spark motor controller.
		 */
		public static final int LEFT_PWM_NUM = 2;
		/**
		 * The PWM output number associated with the intake's right Spark motor controller.
		 */
		public static final int RIGHT_PWM_NUM = 3;
		
		/**
		 * The PCN port for the solenoid to deploy the intake mechanism.
		 */
		public static final int DEPLOY_PCN_ID = 2;
		/**
		 * The PCN port for the solenoid to retract mechanism.
		 */
		public static final int RETRACT_PCN_ID = 3;
	}
	
	/**
	 * Map values associated with the robot's encoders.
	 */
	public static class encoder {
		/**
		 * The digital input channel associated with the left drive train encoder's A channel.
		 */
		public static final int LEFT_A_CHANNEL = 0;
		/**
		 * The digital input channel associated with the left drive train encoder's B channel.
		 */
		public static final int LEFT_B_CHANNEL = 0;
		/**
		 * The digital input channel associated with the right drive train encoder's A channel.
		 */
		public static final int RIGHT_A_CHANNEL = 0;
		/**
		 * The digital input channel associated with the right drive train encoder's B channel.
		 */
		public static final int RIGHT_B_CHANNEL = 0;
	}
	
}