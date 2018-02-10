package org.usfirst.frc.team6574.robot.subsystems;

import org.usfirst.frc.team6574.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;

/**
 * Drive train subsystem for control/PID
 * 
 * @author brantmeierz
 *
 */
public class DriveTrain extends PIDSubsystem {
	
	TalonSRX frontLeft = new TalonSRX(RobotMap.driveTrain.FRONT_LEFT_CAN_ID);
	TalonSRX frontRight = new TalonSRX(RobotMap.driveTrain.FRONT_RIGHT_CAN_ID);
	TalonSRX backLeft = new TalonSRX(RobotMap.driveTrain.BACK_LEFT_CAN_ID);
	TalonSRX backRight = new TalonSRX(RobotMap.driveTrain.BACK_RIGHT_CAN_ID);
	
	Compressor compressor = new Compressor();
	
	DoubleSolenoid shifter = new DoubleSolenoid(0, 1);
	
	Gyro gyro = new AnalogGyro(RobotMap.GYRO_ID);
	
	Encoder leftEncoder = new Encoder(0, 0);
	Encoder rightEncoder = new Encoder(0, 0);
	
	public DriveTrain(double p, double i, double d) {
		super(p, i, d);
		compressor.start();
		compressor.setClosedLoopControl(true);
		getPIDController().setContinuous(false);
		
		gyro.reset();
		
		leftEncoder.setDistancePerPulse(0.0736);
		rightEncoder.setDistancePerPulse(0.0736);
		
		leftEncoder.reset();
		rightEncoder.reset();
	}

	@Override
	protected double returnPIDInput() {
		return 0;
	}

	@Override
	protected void usePIDOutput(double output) {
		//DRIVE TRAIN DRIVE OUTPUT
	}

	@Override
	protected void initDefaultCommand() {
		
	}
	
	public void frontLeft(double speed) {
		frontLeft.set(ControlMode.PercentOutput, -speed);
	}
	
	public void frontRight(double speed) {
		frontRight.set(ControlMode.PercentOutput, speed);
	}
	
	public void backLeft(double speed) {
		backLeft.set(ControlMode.PercentOutput, -speed);
	}
	
	public void backRight(double speed) {
		backRight.set(ControlMode.PercentOutput, speed);
	}
	
	public void set(double speed) {
		frontLeft(speed);
		frontRight(speed);
		backLeft(speed);
		backRight(speed);
	}
	
	/**
	 * Stops all drive train motors.
	 * 
	 * @author brantmeierz
	 * 
	 */
	public void stop() {
		frontLeft.set(ControlMode.PercentOutput, 0);
		frontRight.set(ControlMode.PercentOutput, 0);
		backLeft.set(ControlMode.PercentOutput, 0);
		backRight.set(ControlMode.PercentOutput, 0);
	}
	
	public void stopLeft() {
		frontLeft.set(ControlMode.PercentOutput, 0);
		backLeft.set(ControlMode.PercentOutput, 0);
	}
	
	public void stopRight() {
		frontRight.set(ControlMode.PercentOutput, 0);
		backRight.set(ControlMode.PercentOutput, 0);
	}
	
	public void engageShifter() {
		shifter.set(Value.kForward);
	}

	public void disengageShifter() {
		shifter.set(Value.kReverse);
	}
	
	/**
	 * Gets the average distance of the the left and right drive train encoders since last reset.
	 * 
	 * @return	double containing the average distance in inches
	 */
	public double getEncoderDist() {
		return (leftEncoder.getDistance() + rightEncoder.getDistance()) / 2;
	}
	
	public void clearEncoders() {
		leftEncoder.reset();
		rightEncoder.reset();
	}
	
}
