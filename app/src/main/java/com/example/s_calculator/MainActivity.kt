package com.example.s_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.s_calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAc.setOnClickListener {
            binding.inTxt.text = ""
            binding.outTxt.text = ""
        }

        binding.btn0.setOnClickListener {
            binding.inTxt.append("0")
        }

        binding.btn1.setOnClickListener {
            binding.inTxt.append("1")
        }

        binding.btn2.setOnClickListener {
            binding.inTxt.append("2")
        }

        binding.btn3.setOnClickListener {
            binding.inTxt.append("3")
        }

        binding.btn4.setOnClickListener {
            binding.inTxt.append("4")
        }

        binding.btn5.setOnClickListener {
            binding.inTxt.append("5")
        }

        binding.btn6.setOnClickListener {
            binding.inTxt.append("6")
        }

        binding.btn7.setOnClickListener {
            binding.inTxt.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.inTxt.append("8")
        }

        binding.btn9.setOnClickListener {
            binding.inTxt.append("9")
        }

        binding.btnAdd.setOnClickListener {
            binding.inTxt.append(" + ")
        }

        binding.btnMinus.setOnClickListener {
            binding.inTxt.append(" - ")
        }

        binding.btnMultiply.setOnClickListener {
            binding.inTxt.append(" * ")
        }

        binding.btnDivide.setOnClickListener {
            binding.inTxt.append(" / ")
        }

        binding.btnDot.setOnClickListener {
            binding.inTxt.append(".")
        }

        binding.btnStartBracket.setOnClickListener {
            binding.inTxt.append(" ( ")
        }

        binding.btnEndBracket.setOnClickListener {
            binding.inTxt.append(" ) ")
        }

        binding.btnEqual.setOnClickListener {

            val expression = ExpressionBuilder(binding.inTxt.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()

            if (result == longresult.toDouble()) {
                binding.outTxt.text = longresult.toString()
            } else {
                binding.outTxt.text = result.toString()
            }


        }
    }
}