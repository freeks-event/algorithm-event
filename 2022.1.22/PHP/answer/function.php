<?php
    //ランダムで計算する関数の定義
    function randomOmikuji (): int {
        return rand(1, 4);
    }

    //それぞれの数字に対応するおみくじ関数を定義
    function returnOmikuji(int $number): String {
        switch ($number) {
            case 1:
                $omikuji = "daikichi";
                break;
            case 2:
                $omikuji = "chuukichi";
                break;
            case 3:
                $omikuji = "shoukichi";
                break;
            case 4:
                $omikuji = "kichi";
                break;
        }

        return $omikuji;
    }
