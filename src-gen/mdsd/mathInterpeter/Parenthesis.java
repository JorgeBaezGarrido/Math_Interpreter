/**
 * generated by Xtext 2.20.0
 */
package mdsd.mathInterpeter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.mathInterpeter.Parenthesis#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see mdsd.mathInterpeter.MathInterpeterPackage#getParenthesis()
 * @model
 * @generated
 */
public interface Parenthesis extends Primary
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Exp)
   * @see mdsd.mathInterpeter.MathInterpeterPackage#getParenthesis_Exp()
   * @model containment="true"
   * @generated
   */
  Exp getExp();

  /**
   * Sets the value of the '{@link mdsd.mathInterpeter.Parenthesis#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Exp value);

} // Parenthesis