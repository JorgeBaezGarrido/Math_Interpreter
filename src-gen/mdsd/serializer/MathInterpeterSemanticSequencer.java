/*
 * generated by Xtext 2.20.0
 */
package mdsd.serializer;

import com.google.inject.Inject;
import java.util.Set;
import mdsd.mathInterpeter.Div;
import mdsd.mathInterpeter.MathExp;
import mdsd.mathInterpeter.MathInterpeterPackage;
import mdsd.mathInterpeter.Minus;
import mdsd.mathInterpeter.Mult;
import mdsd.mathInterpeter.Parenthesis;
import mdsd.mathInterpeter.Plus;
import mdsd.services.MathInterpeterGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MathInterpeterSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MathInterpeterGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MathInterpeterPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MathInterpeterPackage.DIV:
				sequence_MultDiv(context, (Div) semanticObject); 
				return; 
			case MathInterpeterPackage.MATH_EXP:
				sequence_MathExp(context, (MathExp) semanticObject); 
				return; 
			case MathInterpeterPackage.MINUS:
				sequence_PlusMinus(context, (Minus) semanticObject); 
				return; 
			case MathInterpeterPackage.MULT:
				sequence_MultDiv(context, (Mult) semanticObject); 
				return; 
			case MathInterpeterPackage.NUMBER:
				sequence_Number(context, (mdsd.mathInterpeter.Number) semanticObject); 
				return; 
			case MathInterpeterPackage.PARENTHESIS:
				sequence_Parenthesis(context, (Parenthesis) semanticObject); 
				return; 
			case MathInterpeterPackage.PLUS:
				sequence_PlusMinus(context, (Plus) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     MathExp returns MathExp
	 *
	 * Constraint:
	 *     exp=Exp
	 */
	protected void sequence_MathExp(ISerializationContext context, MathExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathInterpeterPackage.Literals.MATH_EXP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathInterpeterPackage.Literals.MATH_EXP__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Div
	 *     PlusMinus returns Div
	 *     PlusMinus.Plus_1_0_0_0 returns Div
	 *     PlusMinus.Minus_1_0_1_0 returns Div
	 *     MultDiv returns Div
	 *     MultDiv.Mult_1_0_0_0 returns Div
	 *     MultDiv.Div_1_0_1_0 returns Div
	 *
	 * Constraint:
	 *     (left=MultDiv_Div_1_0_1_0 right=Primary)
	 */
	protected void sequence_MultDiv(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathInterpeterPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathInterpeterPackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathInterpeterPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathInterpeterPackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultDivAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultDivAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Mult
	 *     PlusMinus returns Mult
	 *     PlusMinus.Plus_1_0_0_0 returns Mult
	 *     PlusMinus.Minus_1_0_1_0 returns Mult
	 *     MultDiv returns Mult
	 *     MultDiv.Mult_1_0_0_0 returns Mult
	 *     MultDiv.Div_1_0_1_0 returns Mult
	 *
	 * Constraint:
	 *     (left=MultDiv_Mult_1_0_0_0 right=Primary)
	 */
	protected void sequence_MultDiv(ISerializationContext context, Mult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathInterpeterPackage.Literals.MULT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathInterpeterPackage.Literals.MULT__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathInterpeterPackage.Literals.MULT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathInterpeterPackage.Literals.MULT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultDivAccess().getMultLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultDivAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Number
	 *     PlusMinus returns Number
	 *     PlusMinus.Plus_1_0_0_0 returns Number
	 *     PlusMinus.Minus_1_0_1_0 returns Number
	 *     MultDiv returns Number
	 *     MultDiv.Mult_1_0_0_0 returns Number
	 *     MultDiv.Div_1_0_1_0 returns Number
	 *     Primary returns Number
	 *     Number returns Number
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Number(ISerializationContext context, mdsd.mathInterpeter.Number semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathInterpeterPackage.Literals.NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathInterpeterPackage.Literals.NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Parenthesis
	 *     PlusMinus returns Parenthesis
	 *     PlusMinus.Plus_1_0_0_0 returns Parenthesis
	 *     PlusMinus.Minus_1_0_1_0 returns Parenthesis
	 *     MultDiv returns Parenthesis
	 *     MultDiv.Mult_1_0_0_0 returns Parenthesis
	 *     MultDiv.Div_1_0_1_0 returns Parenthesis
	 *     Primary returns Parenthesis
	 *     Parenthesis returns Parenthesis
	 *
	 * Constraint:
	 *     exp=Exp
	 */
	protected void sequence_Parenthesis(ISerializationContext context, Parenthesis semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathInterpeterPackage.Literals.PARENTHESIS__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathInterpeterPackage.Literals.PARENTHESIS__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Minus
	 *     PlusMinus returns Minus
	 *     PlusMinus.Plus_1_0_0_0 returns Minus
	 *     PlusMinus.Minus_1_0_1_0 returns Minus
	 *
	 * Constraint:
	 *     (left=PlusMinus_Minus_1_0_1_0 right=MultDiv)
	 */
	protected void sequence_PlusMinus(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathInterpeterPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathInterpeterPackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathInterpeterPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathInterpeterPackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusMinusAccess().getRightMultDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Plus
	 *     PlusMinus returns Plus
	 *     PlusMinus.Plus_1_0_0_0 returns Plus
	 *     PlusMinus.Minus_1_0_1_0 returns Plus
	 *
	 * Constraint:
	 *     (left=PlusMinus_Plus_1_0_0_0 right=MultDiv)
	 */
	protected void sequence_PlusMinus(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathInterpeterPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathInterpeterPackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathInterpeterPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathInterpeterPackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusMinusAccess().getRightMultDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
}