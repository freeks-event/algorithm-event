<?php
    include "function.php";

    //②ランダムで計算する関数の定義
    $number = randomOmikuji();

    //③それぞれの数字に対応するおみくじ関数を定義
    $file = returnOmikuji($number);
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Omikuji</title>
</head>
<body>
    <img src="./img/<?php echo "{$file}.jpg" ?>">
</body>
</html>