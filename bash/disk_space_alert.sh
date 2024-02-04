#!/bin/bash

# Set the threshold for disk space (in percentage)
safeMod=90
# Check disk space usage
disk_usage=$(df -h / | awk 'NR==2 {print $6}' | tr -d '%' | cut -d'G' -f1)
echo $disk_usage

if [ "$disk_usage" -ge "$safeMod" ]; then
    
    echo "Warning: Disk space usage is above $safeMod%.free some space." >> /F/caseStudy/bash/masg.txt
else
    echo "Disk space usage is within acceptable limits." >> /F/caseStudy/bash/masg2.txt 
fi

