<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>Bootstrap 3 Control Panel</title>
		<meta name="generator" content="Bootply" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link href="/resources/css/bootstrap.css" rel="stylesheet">
		<!--[if lt IE 9]>
			<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
		<link rel="stylesheet" href="/resources/css/style.css" media="screen"
	type="text/css" />
	</head>
	<body>
<!-- Header -->
<div id="top-nav" class="navbar navbar-inverse navbar-static-top">
  <div class="main-container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-toggle"></span>
      </button>
	  <ul class="nav navbar-nav navbar-left">
		<li><a class="navbar-brand" href="#">Home</a></li>
		<li><a class="navbar-brand" href="#">Notifications</a></li>
		<li><a class="navbar-brand" href="#">Messages</a></li>
		<li><a class="navbar-brand" href="#">#Discovers</a></li>
	  </ul>
     
    </div>
    <div class="navbar-collapse collapse">
      <ul class="nav navbar-nav navbar-right">
        
        <li class="dropdown">
          <a class="dropdown-toggle" role="button" data-toggle="dropdown" href="#">
            <i class="glyphicon glyphicon-user"></i> Admin <span class="caret"></span></a>
          <ul id="g-account-menu" class="dropdown-menu" role="menu">
            <li><a href="#">My Profile</a></li>
            <li><a href="#"><i class="glyphicon glyphicon-lock"></i> Logout</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div><!-- /container -->
</div>
<!-- /Header -->

<!-- Main -->
<div class="main-container ">
  
  <!-- upper section -->
  <div class="row">
	<div class="col-sm-3">
      <div class="panel panel-default">
			<div class="panel-heading">&nbsp;</div>
			<div class="panel-body">
				<h3>${user.fullName}</h3>
				<ul>
					<li>TWEETS: 6</li>
					<li>FOLLOWERS: 16</li>
					<li>FOLLOWING: 26</li>
				</ul>
			</div>
	  </div>    
  	</div><!-- /span-3 -->
    <div class="col-sm-9">
      	
      <!-- column 2 -->	
       <div class="row">
            <!-- center left-->	
         	<div class="col-md-9">
			  <div class="well">
				<h3>Explore Cricket World Cup 2015</h3>
			  </div>
              
              <hr>
              
              <div class="panel panel-default">
                  <div class="panel-heading">
					<div class="controls">
						<input type="text" class="form-control" placeholder="What's Happening">
					</div>
				  </div>
                  <div class="panel-body">
					<!--Tweet-->
					 <div class="col-md-12 list-group">
						<div class="col-md-2 pull-left">
							<img src="/resources/images/2J0xp3FX_bigger.jpeg"/>
						</div>
						<div class="col-md-10 pull-right">
						Amitabh Bachchan ‏@SrBachchan  13h13 hours ago<br>
						T 1776 - Took off for Safai  for wedding  event  .. bad visibility. . Flight diverted to Lucknow .. waiting  for clearance .. safety better
						</div>
					 </div>
					 
					 <div class="col-md-12 list-group">
						<div class="col-md-2 pull-left">
							<img src="/resources/images/2J0xp3FX_bigger.jpeg"/>
						</div>
						<div class="col-md-10 pull-right">
						Amitabh Bachchan ‏@SrBachchan  13h13 hours ago<br>
						T 1776 - Took off for Safai  for wedding  event  .. bad visibility. . Flight diverted to Lucknow .. waiting  for clearance .. safety better
						</div>
					 </div>
					 
					 <div class="col-md-12 list-group">
						<div class="col-md-2 pull-left">
							<img src="/resources/images/2J0xp3FX_bigger.jpeg"/>
						</div>
						<div class="col-md-10 pull-right">
						Amitabh Bachchan ‏@SrBachchan  13h13 hours ago<br>
						T 1776 - Took off for Safai  for wedding  event  .. bad visibility. . Flight diverted to Lucknow .. waiting  for clearance .. safety better
						</div>
					 </div>
					 
					 <div class="col-md-12 list-group">
						<div class="col-md-2 pull-left">
							<img src="/resources/images/2J0xp3FX_bigger.jpeg"/>
						</div>
						<div class="col-md-10 pull-right">
						Amitabh Bachchan ‏@SrBachchan  13h13 hours ago<br>
						T 1776 - Took off for Safai  for wedding  event  .. bad visibility. . Flight diverted to Lucknow .. waiting  for clearance .. safety better
						</div>
					 </div>
                 </div><!--/panel-body-->
              </div><!--/panel-->                     
              
          	</div><!--/col-->
         
            <!--center-right-->
        	<div class="col-md-3">
            
				 <div class="panel panel-default">
						<div class="panel-heading">Whom To Follow</div>
						<div class="panel-body"></div>
				 </div>
				 <div class="panel panel-default">
						<div class="panel-heading">&nbsp;</div>
						<div class="panel-body"></div>
				 </div>
				 <div class="panel panel-default">
						<div class="panel-heading">&nbsp;</div>
						<div class="panel-body"></div>
				 </div>
			</div><!--/col-span-6-->
     
       </div><!--/row-->
  	</div><!--/col-span-9-->
    
  </div><!--/row-->
  <!-- /upper section -->
</div><!--/container-->
<!-- /Main -->


<div class="modal" id="addWidgetModal">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h4 class="modal-title">Add Widget</h4>
      </div>
      <div class="modal-body">
        <p>Add a widget stuff here..</p>
      </div>
      <div class="modal-footer">
        <a href="#" class="btn">Close</a>
        <a href="#" class="btn btn-primary">Save changes</a>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dalog -->
</div><!-- /.modal -->



  
	<!-- script references -->
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>