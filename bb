binaries=$(find . -type f | perl -lne 'print if -B')
morgue="morgue"
mkdir -p $morgue

for b in $binaries
do
    otool -tvV $b | tee $morgue/$b.asm
done
