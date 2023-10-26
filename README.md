# theory-of-programming-language-and-compilators-4-task
##Техническое задание
Написать программу, позволяющую конкатенировать два языка.
Входные данные: Цепочки языка L1, цепочки языка L2. Количество цепочек в языке <= 10000, длина цепочки <= 100
Выходные данные: Цепочки получившегося языка L1L2.
##Программное обеспечение
Intellij IDEA Community/Ultimate
Склонировать проект и запустить
##Тесты
1.l1 = {ab, cd, ef}
  l2={jk, hm, op}
  l1l2={abjk, abhm, abop, cdjk, cdhm, cdop, efjk, efhm, efop}
  input: 3 ab cd ef 3 jk hm op
  output: abjk abhm abop cdjk cdhm cdop efjk efhm efop  

2.l1={λ}
  l2={abc, de}
  l1l2={abc, de}
  input:0 3 abc de
  output: abc de
3.l1={abc, de}
  l2={λ}
  l1l2={abc, de}
  input: 3 abc de 0
  output: abc de
4.l1={λ}
  l2={λ}
  l1l2={λ}
  input: 0 0
  output:
