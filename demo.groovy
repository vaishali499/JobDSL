pipelineJob('test-job') {
  properties{
    promotions {
      promotion {
        name('Development')
        conditions {
          manual('testuser')
        }
        wrappers {
          timestamps()
        }
        actions {
          shell('echo hello;')
        }
      }
    }
  }
}
