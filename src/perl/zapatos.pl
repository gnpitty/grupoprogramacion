@lis1  =();

$conta = <STDIN>;
chop $conta;

print $conta,"\n";

while($conta > 0){
$_ = <STDIN>;
chop;
print "<>>>> [$_]\n";
$num = substr($_,0,1);
$lado = substr($_,2,1);
push (@lis1,$num);
print $num," $lado\n";
$data{"$num:$lado"}+= 1;
$mkey{$num}++;
$conta--;
}

@lis2 = keys %mkey;
$pares = 0;
foreach  $i  (@lis2){
# print " >$i L:", $data{"$i:L"}," R:" ,$data{"$i:R"},"\n";
  $zl = $data{"$i:L"};
  $zr = $data{"$i:R"};
  if ($zl <= $zr  && exists($data{"$i:L"}) ){ print " A>$i [$zl] \n"; $pares+= $zl};
  if ($zr <  $zl  && exists($data{"$i:R"}) ){ print " B>$i [$zr]\n";  $pares+= $zr};
}
print "PARES: $pares\n";


__DATA__
1 L
2 R
2 L
2 L
1 L
1 R
1 L
1 R
1 L
4 R
1 L
1 R
4 L
1 R
5 R
