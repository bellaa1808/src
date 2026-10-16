import java.awt.BorderLayout
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JTextField
import javax.swing.JButton
import javax.swing.JPanel
import javax.swing.BorderFactory
import java.awt.GridLayout
import java.awt.FlowLayout

class Janela : JFrame("Minha Janela") {
    init {
        setSize(500,400)
        setLocationRelativeTo(null)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        val painel = JPanel(GridLayout(0, 1, 10, 10))
        painel.border = BorderFactory.createEmptyBorder(20, 30, 20, 30)

        val layout = JPanel(FlowLayout())

        val textoaltura = JLabel ("Digite a altura")
        val campoaltura = JTextField(30)
        val textobase = JLabel ("Digite a base")
        val campobase = JTextField(30)
        val botaoArea = JButton("Calcular Area")
        val campoArea = JLabel("Area: ")
        val botaoPerimetro = JButton("calcular Perimetro")
        val campoPerimetro = JLabel("Perimetro ")

        painel.add(textoaltura)
        painel.add(campoaltura)
        painel.add(textobase)
        painel.add(campobase)
        layout.add(botaoArea)
        painel.add(campoArea)
        layout.add(botaoPerimetro)
        painel.add(campoPerimetro)
        add(painel, BorderLayout.CENTER)
        add(layout, BorderLayout.SOUTH)

        botaoArea.addActionListener {
            val base = campobase.text.toInt()
            val altura = campoaltura.text.toInt()

            val retangulo = Retangulo(base, altura)
            campoArea.text = "Área: ${retangulo.caluclarArea()}"
        }

        botaoPerimetro.addActionListener {
            val base = campobase.text.toInt()
            val altura = campoaltura.text.toInt()

            val retangulo = Retangulo(base, altura)
            campoPerimetro.text = "Perímetro: ${retangulo.calcularPerimetro()}"
        }

        isVisible = true
    }
}
