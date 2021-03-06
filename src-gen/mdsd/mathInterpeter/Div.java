/**
 * generated by Xtext 2.20.0
 */
package mdsd.mathInterpeter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Div</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.mathInterpeter.Div#getLeft <em>Left</em>}</li>
 *   <li>{@link mdsd.mathInterpeter.Div#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see mdsd.mathInterpeter.MathInterpeterPackage#getDiv()
 * @model
 * @generated
 */
public interface Div extends Exp
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Exp)
   * @see mdsd.mathInterpeter.MathInterpeterPackage#getDiv_Left()
   * @model containment="true"
   * @generated
   */
  Exp getLeft();

  /**
   * Sets the value of the '{@link mdsd.mathInterpeter.Div#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Exp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Primary)
   * @see mdsd.mathInterpeter.MathInterpeterPackage#getDiv_Right()
   * @model containment="true"
   * @generated
   */
  Primary getRight();

  /**
   * Sets the value of the '{@link mdsd.mathInterpeter.Div#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Primary value);

} // Div
