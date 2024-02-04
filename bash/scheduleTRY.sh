#!/bin/bash

while true; do
    # Run your daily backup script&alert
  /f/caseStudy/bash/backupCase.sh

/f/caseStudy/bash/disk_space_alert.sh
    # Sleep for 24 hours (86400 seconds)
    sleep 86400
done
